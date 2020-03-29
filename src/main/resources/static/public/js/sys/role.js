$(function(){
    //$('.spk').selectpicker();
    $("#table").bootstrapTable({
        url:"/sys/role/list",
        pagination:true,
        sidePagination:"server",
        showRefresh: true,  //显示刷新按钮
        search: true,
        toolbar: '#toolbar',
        columns:[
            {field:'ck',checkbox:true},
            {field:'roleId',title:'编号'},
            {field:'roleName',title:'角色名'},
            {field:'remark',title:'标注'},
            {field:'permsUser',title:'拥有用户',formatter:function(v,r,index){
                    var document="<select>"
                    $.each(v,function (i,r) {
                        document+="<option value="+r.userId+">"+r.username+"</option>"
                    })
                    document+="</select>"
                    return document;
                }},
            {field:'permsMenu',title:'权限菜单',formatter:function(v,r,index){
                    var document="<select>"
                    $.each(v,function (i,r) {
                        document+="<option value="+r.menuId+">"+r.name+"</option>"
                    })
                    document+="</select>"
                    return document;
                }
            }
        ]
    });


});

var vm  = new Vue({
    el:'#dtapp',
    data:{
        showList:true,
        title:'',
        role:{},
        disPermsUser :[],permsUser:[],disPermsMenu:[],permsMenu:[]
    },
    methods:{
        del: function(){
            //getSelectedRows();：common.js中定义   功能获得用户选择的记录  返回的是数组
            var rows = getSelectedRows();
            if(rows == null){
                return ;
            }
            var id = 'roleId';
            //提示确认框
            layer.confirm('您确定要删除所选数据吗？', {
                btn: ['确定', '取消'] //可以无限个按钮
            }, function(index, layero){
                var ids = new Array();
                //遍历所有选择的行数据，取每条数据对应的ID
                $.each(rows, function(i, row) {
                    ids[i] = row[id];//得到选择的这一行的id
                });

                //ids  = [1,2,3];//json数组
                $.ajax({
                    type: "DELETE",
                    url: "/sys/role/del",
                    data: JSON.stringify(ids),//把json数组转json字符串
                    success : function(r) {
                        if(r.code === 0){//成功

                            layer.alert('删除成功');
                            //刷新
                            $('#table').bootstrapTable('refresh');
                        }else{
                            layer.alert(r.msg);
                        }
                    },
                    error : function() {
                        layer.alert('服务器没有返回数据，可能服务器忙，请重试');
                    }
                });
            });
        },
        add: function(){
            if(vm.perms(0)) return;
            vm.showList = false;
            vm.title = "新增";
            $('.spk_remove').hide()
        },
        update: function (event) {
            var id = 'roleId';
            var roleId = getSelectedRow()[id];
            if(roleId == null){
                return ;
            }

            $('.spk_remove').show();
            if(vm.perms(roleId)) return;

            vm.showList = false;
            vm.title = "修改";
        },
        saveOrUpdate: function (event) {
            //获取选中的值

            var sau=$('.spk_add_user select+button').attr("title");
            var sdu=$('.spk_remove_user select+button').attr("title");
            var sam=$('.spk_add_menu select+button').attr("title");
            var sdm=$('.spk_remove_menu select+button').attr("title");
            sau=sau=='赋予角色'?'':sau;
            sdu=sdu=='移除角色'?'':sdu;
            sam=sam=='赋予菜单'?'':sam;
            sdm=sdm=='移除菜单'?'':sdm;

            function handlerStr(str,name){
                var result=new Array();
                var split = str.split(',');
                $.each(split,function (i,r) {
                    var trim = r.trim();
                    if(r.length==0) return;
                    result[result.length]={};
                    result[result.length-1][name]=trim;
                })
                return result;
            }

            vm.role.permsUser=handlerStr(sau,'username');
            vm.role.disPermsUser=handlerStr(sdu,'username');
            vm.role.permsMenu=handlerStr(sam,'name');
            vm.role.disPermsMenu=handlerStr(sdm,'name');

            //有菜单编号时是修改，没有：新增

            var url = vm.role.roleId == null ? "../sys/role/save" : "../sys/role/update";
            $.ajax({
                type: "PUT",
                url: url,
                data: JSON.stringify(vm.role),//json字符串
                success: function(r){
                    if(r.code === 0){
                        layer.alert('操作成功', function(index){
                            layer.close(index);
                            vm.reload();
                        });
                    }else{
                        layer.alert(r.msg);
                    }
                }
            });
        },
        reload: function (event) {
            vm.showList = true;
            $("#table").bootstrapTable('refresh');
        },
        perms:function (i) {
            $.ajax({
                url:"../sys/role/perms/"+i,
                type:"GET",
                async:false,
                success:function (r) {
                    vm.disPermsMenu=r.disPermsMenu;
                    vm.disPermsUser=r.disPermsUser;
                    vm.permsMenu=r.permsMenu;
                    vm.permsUser=r.permsUser;
                    $('.spk').selectpicker('refresh');
                    vm.role=(i!=0?r.role:{"createDate":new Date()});
                    return true;
                },
                error :function () {
                    return false;
                }
            })
        }
    }
});
