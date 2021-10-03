$(function(){
    $(".btn").click(function(){
        if(!confirm("입력하시겠습니까?")) return;
        let teacher = $(".teacher").val();
        let grade = $(".grade").val();
        let classroom = $(".classroom").val();
        if(teacher == ""){
            alert("교사명을 입력하세요")
        }
        if(grade == ""){
            grade = 0
        }
        let data = {
            ret_name : teacher,
            ret_grade_age : grade,
            ret_class_room : classroom
        }
        console.log(data)
        $.ajax({
            type:"patch",
            url:"/admin/api/classroom_teacher?name="+teacher+"&class_room="+classroom+"&grade="+grade,
            data:JSON.stringify(data),
            contentType: "application/json",
            success: function (r) {
                alert(r.message);
                location.reload();
            }
        })
    })
})