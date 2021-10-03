$(function(){
    $(".insert_one").click(function(){
        if(!confirm("실행하시겠습니까?")) return;
        let age = 17
        console.log(age)
        $.ajax({
                type:"patch",
                url:"/admin/api/classroom_student?age="+age,
                data:JSON.stringify(age),
                contentType:"application/json",
                success:function(r) {
                    alert(r.message);
                    location.reload();
                }
            })
    })
    $(".insert_two").click(function(){
        if(!confirm("실행하시겠습니까?")) return;
        let age = 18
        console.log(age)
        $.ajax({
            type:"patch",
            url:"/admin/api/classroom_student?age="+age,
            data:JSON.stringify(age),
            contentType:"application/json",
            success:function(r) {
                alert(r.message);
                location.reload();
            }
        })
    })
    $(".insert_three").click(function(){
        if(!confirm("실행하시겠습니까?")) return;
        let age = 19
        console.log(age)
        $.ajax({
            type:"patch",
            url:"/admin/api/classroom_student?age="+age,
            data:JSON.stringify(age),
            contentType:"application/json",
            success:function(r) {
                alert(r.message);
                location.reload();
            }
        })
    })
})