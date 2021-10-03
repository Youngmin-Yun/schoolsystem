$(function () {
    $("#btn").click(function () {
        if (!confirm("등록하시겠습니까?")) return;
        let semester = $("#semester").val()
        let term = $("#term").val()
        let student = $("#student").val()
        let subject = $("#subject").val()
        let score = $("#score").val()
        let age = $("#age").val()
        if (score >= 100) {
            score = 100
        }
        if (score <= 0) {
            score = 0
        }
        if (score == "" || score == null) {
            alert("점수를 입력하세요")
            return;
        }
        let data = {
            t_semester: semester,
            t_term: term,
            t_subject: subject,
            t_score: score,
            t_res_seq: student,
            t_res_age: age
        }
        console.log(data)
        // $.ajax({
        //     type: "post",
        //     url: "/testscore/api/insert",
        //     data: JSON.stringify(data),
        //     contentType: "application/json",
        //     success: function (r) {
        //         alert(r.message);
        //         location.reload();
        //     }
        // })
    })
})