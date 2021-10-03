$(function(){
    let idcheck = false;
    let emailcheck = false;
    $("#join").click(function(){
        if( idcheck == false){
            alert("아이디 중복여부를 확인해주세요");
            return;
        }
        if( emailcheck == false){
            alert("이메일 중복여부를 확인해주세요");
            return
        }
        const pattern = /\s/g; // 공백 체크 정규표현식
        let user_id = $("#user_id").val();
        if(user_id == ""|| user_id == null || user_id == undefined ){
            alert("아이디를 입력해주세요");
            return;
        }
        if(user_id.match(pattern)){
            alert("아이디에는 공백을 사용 할 수 없습니다.");
            return;
        }
        let user_pwd = $("#user_pwd").val();
        if(user_pwd == ""|| user_pwd == null || user_pwd == undefined ){
            alert("비밀번호를 입력해주세요");
            return;
        }
        if(user_pwd.match(pattern)){
            alert("비밀번호에는 공백을 사용 할 수 없습니다.");
            return;
        }
        let user_pwd_confirm = $("#user_pwd_confirm").val();
        if(user_pwd != user_pwd_confirm){
            alert("비밀번호가 일치하지 않습니다.");
            return;
        }
        let user_name = $("#user_name").val();
        if(user_name == ""|| user_name == null || user_name == undefined ){
            alert("이름을 입력해주세요");
            return;
        }
        if(user_name.match(pattern)){
            alert("이름에는 공백을 사용 할 수 없습니다.");
            return;
        }
        const patternEmail = /^[0-9a-zA-Z]([-_\.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_\.]?[0-9a-zA-Z])*\.[a-zA-Z]{2,3}$/i; // 이메일 확인하는 정규표현식
        let user_email = $("#user_email").val();
        if(user_email == ""|| user_email == null || user_email == undefined ){
            alert("이메일을 입력해주세요");
            return;
        }
        if(user_email.match(pattern)){
            alert("이메일에는 공백을 사용 할 수 없습니다.");
            return;
        }
        if(!user_email.match(patternEmail)){
            alert("올바른 이메일의 형식으로 입력하세요.");
            return;
        }
        let user_address=$("#user_address").val();
        let user_phone=$("#user_phone").val();
        let user_birth = $("#user_birth").val();
        let user_subject = $("#user_subject").val();

        if(!inputValidation(user_address,"주소")) {return;}
        if(!inputValidation(user_phone,"전화번호")) {return;}
        
        let data = {
            ret_id:user_id,
            ret_pwd:user_pwd,
            ret_name:user_name,
            ret_email:user_email,
            ret_address:user_address,
            ret_birth:user_birth,
            ret_phone: user_phone,
            ret_subject:user_subject
            }
        $.ajax({
            type:"post",
            url:"/regist/api/teacher",
            data:JSON.stringify(data),
            contentType:"application/json",
            success:function(r){
                alert(r.message);
                if(r.status){
                    location.reload();
                }
            },
            error:function(e){
                console.log(e);
            }
            
        })
    })
    $("#chk_id").click(function(){
        const pattern = /\s/g;
        let user_id = $("#user_id").val();
        if(user_id == ""|| user_id == null || user_id == undefined ){
            alert("아이디를 입력해주세요");
            return;
        }
        if(user_id.match(pattern)){
            alert("아이디에는 공백을 사용 할 수 없습니다.");
            return;
        }
        $.ajax({
            type:"get",
            url:"/regist/api/teacherid?id="+user_id,
            success:function(r){
                // 요청결과로 상태값이 200이나 202가 나왔을 때 실행.
                alert(r.message);
                idcheck = !r.status;
            }
        })
    })
    $("#chk_email").click(function(){
        const pattern = /\s/g; // 공백에 대한 정규표현식
        const patternEmail = /^[0-9a-zA-Z]([-_\.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_\.]?[0-9a-zA-Z])*\.[a-zA-Z]{2,3}$/i; // 이메일 확인하는 정규표현식
        let user_email = $("#user_email").val();
        if(user_email == ""|| user_email == null || user_email == undefined ){
            alert("이메일을 입력해주세요");
            return;
        }
        if(user_email.match(pattern)){
            alert("이메일에는 공백을 사용 할 수 없습니다.");
            return;
        }
        if(!user_email.match(patternEmail)){
            alert("올바른 이메일의 형식으로 입력하세요.");
            return;
        }
        $.ajax({
            type:"get",
            url:"/regist/api/teacheremail?email="+user_email,
            success:function(r){
                alert(r.message);
                emailcheck = !r.status;
            }
        })
    })
    $("#user_id").change(function(){
        idcheck=false;
    })
    $("#user_email").change(function(){
        emailcheck=false;
    })
});

function inputValidation(input, type){
    if(input == "" || input == null || input == undefined){
        alert(type+"을/를 입력해주세요");
        return false;
    }
    return true;
}