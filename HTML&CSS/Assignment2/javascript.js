// performed step - i, ii, iii, iv, v, 

const users = {"admin":"admin", 
                "vineetks":"vinnetks",
                 "csk":"ppjsaraswativihar", 
                 "ashokp":"ashok&panday"}


function login(name, password){
    if (name in users){
        if(password == users[name]){
            location.href = "bootstrap_profilePage.htm";
            return "";
        }
        else{
            return "password of user is incorrect";
        }
    }

    else{
        return "User name does not exist, try signup for new user";
    }
    
}


function check(){
    let name = document.getElementById("name").value;
    let pass = document.getElementById("pass").value;
    let s = login(name, pass);
    document.getElementById("invalid-login").innerHTML= s;
}



