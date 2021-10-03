$(function(){
    let org_id = $("#user_id").val()
    $("#chk_id").click(function(){
        const pattern = /\s/g;
        let id = $("#user_id").val()
        if(id == null || id == "" || id == undefined){
            id = org_id
        }
        if(id.match(pattern)){
            alert("공백이 있습니다.")
            return
        }
        alert(id+"로 하시겠습니까?")
    })
    const patternEmail = /^[0-9a-zA-Z]([-_\.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_\.]?[0-9a-zA-Z])*\.[a-zA-Z]{2,3}$/i
    let org_email = $("#user_email").val()
    $("#chk_email").click(function(){
        let email = $("#user_email").val()
        if(email == null || email == "" || email == undefined){
            email = org_email
        }
        if(email.match(patternEmail)){
            alert("이메일에 공백이 있습니다.")
        }
        if(!email.match(patternEmail)){
            alert("이메일의 양식에 맞지 않습니다.")
        }
    })
    let org_name = $("#user_name").val()
    let org_address = $("#user_address").val()
    let org_phone = $("#user_phone").val()
    $("#mode").click(function(){
        let seq = $("#user_seq").val()
        let id = $("#user_id").val()
        let pwd = $("#user_pwd").val()
        let check_pwd = $(".user_pwd_confirm").val()
        let user_name = $("#user_name").val()
        let user_email = $("#user_email").val()
        let address = $("#user_address").val()
        let phone = $("#user_phone").val()

        let data = {
            ret_seq:seq,
            ret_id:id,
            ret_pwd:pwd,
            ret_name:user_name,
            ret_email:user_email,
            ret_address:address,
            ret_phone:phone
        }
        if(pwd != check_pwd || pwd == ""|| pwd == null ||check_pwd == null || check_pwd == undefined || check_pwd == ""){
            alert("비밀번호가 일치하지 않습니다.")
            return
        }
        $("#user_name").change(function(){
            org_name = $("#user_name").val()
        })
        if(user_name == null || user_name == "" || user_name == undefined){
            alert("이름을 입력하세요")
            return
        }
        console.log(data)
        $.ajax({
            type:"patch",
            url:"/teacher/api/info_change",
            contentType: "application/json",
            data:JSON.stringify(data),
            success:function(r){
                alert(r.message)
                location.href = "/teacher"
            },
            error:function(e){
                console.log(e);
            }

        })
    })
})