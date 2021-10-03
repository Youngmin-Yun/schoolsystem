$(function(){
    $("#save").click(function(){
        if(!confirm("등록하시겠습니까?")) return
        let date = $("#date").val()
        let title = $("#title").val()
        let name = $("#name").val()
        let contents = $("#contents").val()
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
            noti_date:date,
            noti_content:contents,
            noti_writer:name,
            noti_title:title
        }
        console.log(data)
        $.ajax({
            type:"post",
            url:"/teacher/api/event",
            data: JSON.stringify(data),
            contentType: "application/json",
            success: function (r) {
                alert(r.message);
                location.href="/teacher";
            }
        })
    })
})