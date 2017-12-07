/*加密函数*/
function Encrypting(account,pwd) {

    var x_temp_str1;
    var x_temp_str2;
    var x_length;
    var x_position1;
    var x_position2;
    var x_temp_int1;
    var x_temp_int2;

    var account_string = account.replace(/(^\s+)|(\s+$)/g,'');
    account_string = account_string.toUpperCase();
    var pw_string = pwd.replace(/(^\s+)|(\s+$)/g,'');
    pw_string = pw_string.toUpperCase();


    /*根据account的第一个字符变换password的第一个字符*/
    if(pw_string.length > 0){
        x_length = account_string.length;
        x_position1 = 0;
        x_temp_int1 = 0;

        while(x_position1 < x_length){
            x_temp_str1 = account_string.substring(x_position1,x_position1+1);
            x_temp_int2 = x_temp_str1.charCodeAt(0);
            x_temp_int1 = x_temp_int1 + x_temp_int2;
            x_position1++;
        }


        x_temp_int1 = x_temp_int1 + x_length;

        while(x_temp_int1 > 122 ){
            x_temp_int1 = x_temp_int1 - 75;
        }
        x_temp_str2 = pw_string.substring(0,1);
        x_temp_int2 = x_temp_str1.charCodeAt(0);
        x_temp_int1 = x_temp_int1 + x_temp_int2;

        if(x_temp_int1 > 122 && x_temp_int1 < 198){
            x_temp_int1 = x_temp_int1 - 75;
        }

        if(x_temp_int1 > 197){
            x_temp_int1 = x_temp_int1 - 133;
        }
        if(x_temp_int1 > 57 && x_temp_int1 < 65){
            x_temp_int1 = x_temp_int1 - 7;
        }
        if(x_temp_int1 > 90 && x_temp_int1 < 97){
            x_temp_int1 = x_temp_int1 - 6;
        }
        x_length = pw_string.length;
        x_temp_int2 = x_length - 1;
        pw_string = String.fromCharCode(x_temp_int1) + pw_string.substring((pw_string.length-x_temp_int2),pw_string.length);


        /*变换pass word*/
        x_position1 = 0;
        while(x_position1 < x_length){



            x_temp_str1 = pw_string.substring(x_position1,x_position1+1);
            x_temp_int1 = x_temp_str1.charCodeAt(0);
            x_position2 = x_position1 - 1;
            if(x_position2 == -1){
                x_position2 = x_length - 1;
            }



            x_temp_str2 = pw_string.substring(x_position2,x_position2+1);
            x_temp_int2 = x_temp_str2.charCodeAt(0);
            x_temp_int1 = x_temp_int1 + x_temp_int2;



            if(x_temp_int1 > 122 && x_temp_int1 < 198){
                x_temp_int1 = x_temp_int1 - 75;
            }

            if(x_temp_int1 > 197){
                x_temp_int1 = x_temp_int1 - 133;
            }

            if(x_temp_int1 > 57 && x_temp_int1 < 65){
                x_temp_int1 = x_temp_int1 - 7;
            }

            if(x_temp_int1 > 90 && x_temp_int1 < 97){
                x_temp_int1 = x_temp_int1 - 6;
            }
            if(x_position1 == 0){
                x_temp_int2 = x_length - 1;
                pw_string = String.fromCharCode(x_temp_int1) + pw_string.substring((pw_string.length-x_temp_int2),pw_string.length);
            }else{
                x_temp_int2 = x_length - x_position1 -1;
                x_position1 = x_position1 - 1;
                pw_string = pw_string.substring(0,x_position1+1) +  String.fromCharCode(x_temp_int1)
                    + pw_string.substring((pw_string.length-x_temp_int2),pw_string.length);
                x_position1++;
            }
            x_position1++;

        }
        return pw_string;
    }
    else{
        return "";
    }

}