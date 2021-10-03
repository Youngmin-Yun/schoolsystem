$(function () {
    let original_id = $("#user_id").val()
    $("#chk_id").click(function () {
        const pattern = /\s/g;
        let user_id = $("#user_id").val()
        if (user_id == "" || user_id == null || user_id == undefined) {
            user_id = original_id
        }
        if (user_id.match(pattern)) {
            alert("아이디에 공백이 있습니다.")
            return;
        }
        alert(user_id + "로 하시겠습니까?")
    })


    const patternEmail = /^[0-9a-zA-Z]([-_\.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_\.]?[0-9a-zA-Z])*\.[a-zA-Z]{2,3}$/i
    let org_email = $("#user_email").val()
    $("#chk_email").click(function () {
        let user_email = $("#user_email").val()
        if (user_email == "" || user_email == null || user_email == undefined) {
            alert("이메일을 입력해주세요")
            return
        }
        if (user_email.match(patternEmail)) {
            alert("이메일에 공백이 있습니다.")
            return
        }
        if (!user_email.match(patternEmail)) {
            alert("올바른 이메일의 형식으로 입력하세요.")
            return
        }
    })
    
    let org_address = $("#user_address").val()
    let org_phone = $("#user_phone").val()
    let org_phone2 = $("#user_phone2").val()
    $("#mode").click(function () {
        let user_id = $("#user_id").val()
        let org_pwd = $("#user_pwd").val()
        let check_pwd = $(".user_pwd_confirm").val()
        let seq = $("#user_seq").val()
        let user_name = $("#user_name").val()
        let user_email = $("#user_email").val()
        let address = $("#address").val()
        if(address==null||address==""||address==undefined){
            address = org_address
        }
        let phone = $("#phone").val()
        if(phone == null || phone == "" || phone == undefined){
            phone = org_phone
        }
        let phone2 = $("#phone2").val()
        if(phone2 == null || phone2 == "" || phone2 == undefined){
            phone2 = org_phone2
        }
        let data = {
            res_seq:seq,
            res_id: user_id,
            res_pwd: org_pwd,
            res_name: user_name,    
            res_email: user_email,
            res_address: address,
            res_phone: phone,
            res_phone2: phone2
        }
        
        if(org_pwd != check_pwd || check_pwd == null || check_pwd == "" || check_pwd == undefined || org_pwd == null || org_pwd == undefined || org_pwd == "") {
            alert("기존 비밀번호가 다릅니다")
            return
        }

        let origin_name = $("#user_name").val();
        $("#user_name").change(function () {
            origin_name = $("#user_name").val();
        })
        if (origin_name == null || origin_name == "" || origin_name == undefined) {
            alert("이름을 입력하세요")
            return
        }
        console.log(data)
        $.ajax({
            type: "patch",
            url: "/student/update/api",
            contentType: "application/json",
            data: JSON.stringify(data),
            success: function (r) {
                alert(r.message)
                location.href = "/"
            },
            error:function(e){
                console.log(e);
            }
        })
    })
})