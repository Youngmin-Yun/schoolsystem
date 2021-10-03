$(function () {
    $("#save").click(function () {
        if (!confirm("등록하시겠습니까?")) return;
        let grade = $("#grade").val();
        let subject = $("#subject").val();
        if (grade == null || grade == "") {
            alert("학년을 입력하세요")
            return;
        }
        if (subject == null || subject == "") {
            alert("과목을 입력하세요")
            return;
        }
        if(grade == 1){
            grade = 17;
        }
        if(grade == 2){
            grade = 18;
        }
        if(grade == 3){
            grade = 19;
        }
        console.log(grade)
        let data = {
            sb_subject: subject,
            sb_grade: grade
        }
        $.ajax({
            type: "post",
            url: "/class/api/subject",
            data: JSON.stringify(data),
            contentType: "application/json",
            success: function (r) {
                alert(r.message);
                location.reload();
            }
        })
    })
})