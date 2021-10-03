$(function(){
    $("#btn").click(function(){
        let id = $("#user_id").val()
        let pwd = $("#user_pwd").val()
        let data = {
            id:id,
            pwd:pwd
        }
        $.ajax({
            type:"post",
            url:"/school/login/teacher",
            data:JSON.stringify(data),
            contentType:"application/json",
            success:function(r){
                if(r.status){
                    location.href="/teacher";
                }
                else{
                    alert(r.message);
                }
            }
        })
    })
})