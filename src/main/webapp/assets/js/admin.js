$(function () {
    $("#save").click(function () {
        if (!confirm("등록하시겠습니까?")) return;
        let date = $("#date").val();
        let content = $("#content").val();
        if (date == null || date == "" || date == undefined) {
            alert("행사내용을 입력해주세요");
            return;
        }

        let data = {
            ad_event_date: date,
            ad_event_content: content
        }
        $.ajax({
            type: "post",
            url: "/admin/api/event",
            data: JSON.stringify(data),
            contentType: "application/json",
            success: function (r) {
                alert(r.message);
                location.reload();
            }
        })
    })
    $(".delete").click(function(){
        if(!confirm("삭제하시겠습니까?")) return;
        let del = $(this).attr("data-seq");
        $.ajax({
            type:"delete",
            url:"/admin/api/delete?seq="+del,
            success: function(r){
                alert(r.message);
                location.reload();
            }
        })
    })
    $(".change").click(function(){
        if(!confirm("수정하시겠습니까?")) return;
        let ch = $(this).attr("date-seq");
        let date = $(".changeDate").val();
        let event = $(".changeEvent").val();
        console.log(ch, date, event)
        
        // if(date == ""||date==null||date==undefined){
        //     alert("수정할 날짜를 입력해주세요.");
        // }
        // if(event==""||event==null||event==undefined){
        //     alert("수정할 내용을 입력해주세요.");
        // }
        let data = {
            ad_seq : ch,
            ad_event_date : date,
            ad_event_content : event

        }
        console.log(data)
        // $.ajax({
        //     type:"patch",
        //     url:"admin/api/change",
        //     data:JSON.stringify(data),
        //     contentType:"application/json",
        //     success:function(r) {
        //         alert(r.message);
        //         location.reload();
        //     }
        // })
    })
    $("#search").click(function(){
        if(!confirm("해당기간을 조회하시겠습니까?")) return;

        let first = $("#firstdate").val();
        let end = $("#enddate").val();

        if (first == null || first == "" || first == undefined) {
            alert("조회 시작일을 선택하세요");
            return;
        }
        if (first > end){
            alert("조회 종료일이 조회 시작일 이전입니다.");
            return;
        }
        if (end == null || end == "" || end == undefined) {
            alert("조회 종료일을 선택하세요");
            return;
        }
        $.ajax({
            type:"get",
            url:"admin/api/search?startDate="+first+"&endDate="+end,
            success: function(r){ 
                alert("조회되었습니다.");
            }
        })
        
    })
    $("#logout").click(function(){
        if(confirm("로그아웃 하시겠습니까?")){
            location.href = "/logout/system"
        }
    })
})