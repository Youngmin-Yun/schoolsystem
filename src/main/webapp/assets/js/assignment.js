$(function(){
    $("#file_save").click(function(){
        let assignmnet = $("#assignment");
        let FormData = new FormData(assignmnet[0]);
        console.log(assignmnet)
        $.ajax({
            url:"/assignment/upload",
            type:"post",
            data:FormData,
            contentType:false,
            processData:false,
            success:function(r){
                console.log(r);
                if(r.status){
                    $("#file_save").prop("disabled", true);
                    $("#file_delete").prop("disabled", false);
                }
                alert(r.message);
            }
        })
    })
})