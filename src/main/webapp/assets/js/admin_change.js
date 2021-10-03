$(function(){
    $("#chk_id").click(function(){
        let org_id = $("#user_id").val()
        let id = $("#user_id").val()
        if(id == null || id == "" || id == undefined){
            id = org_id
        }
        alert(id+" 로 하시겠습니까?")
    })
    $("#chk_email").click(function(){
        let org_email = $("#user_email").val()
        let email = $("#user_email").val()
        if(email == "" || email == null || email == undefined){
            email = org_email
        }
        alert("사용하시겠습니까?")
    })
    let org_address = $("#user_address").val()
    let org_phone = $("#user_phone").val()
    let org_name = $("#user_name").val()
    $("#mod").click(function(){
        let seq = $("#user_seq").val()
        let id = $("#user_id").val()
        let pwd = $("#user_pwd").val()
        let check_pwd = $("#user_pwd_confirm").val()
        if(pwd != check_pwd || pwd == ""|| pwd == null ||check_pwd == null || check_pwd == undefined || check_pwd == ""){
            alert("비밀번호가 일치하지 않습니다.")
        }
        let name = $("#user_name").val()
        if(name == "" || name == null || name == undefined){
            name = org_name
        }
        let email = $("#user_email").val()
        let address = $("#user_address").val()
        if(address == null || address == "" || address == undefined){
            address = org_address
        }
        let phone = $("#user_phone").val()
        if(phone == null || phone == "" || phone == undefined){
            phone = org_phone
        }
        let data = {
            ad_seq : seq,
            ad_id : id,
            ad_pwd : pwd,
            ad_name : name,
            ad_address : address,
            ad_phone : phone,
            ad_email : email
        }
        console.log(data)
        $.ajax({
            type:"patch",
            url:"/admin/api/change/myinfo",
            contentType: "application/json",
            data:JSON.stringify(data),
            success:function(r){
                alert(r.message)
                location.href = "/admin"
            },
            error:function(e){
                console.log(e);
            }
        })
    })
})