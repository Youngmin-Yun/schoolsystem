$(function(){
    $("#save").click(function(){
        if(!confirm("등록하시겠습니까?")) return
        let date = $("#date").val()
        let title = $("#title").val()
        let contents = $("#contents").val()
        let class_room = $("#class_room").val()
        let grade = $("#grade").val()
        if(date == null || date ==""){
            alert("날짜를 입력하세요.")
            return
        }
        if(title == null||title ==""){
            alert("제목을 입력하세요.")
            return
        }
        if(contents == null || contents == ""){
            alert("내용을 입력하세요.")
            return
        }
        let data = {
            nc_date:date,
            nc_title:title,
            nc_content:contents,
            nc_class_room : class_room,
            nc_grade_age:grade
        }
        console.log(data)
        $.ajax({
            type:"post",
            url:"/teacher/api/class_event",
            data: JSON.stringify(data),
            contentType: "application/json",
            success: function (r) {
                alert(r.message);
                location.href="/teacher";
            }
        })
    })
})