var currentNumberWrapper = document.getElementById('currentNumber');
var currentNumber = 0;

function increment(){
    currentNumber = currentNumber + 1;
    currentNumberWrapper.innerHTML = currentNumber;
    if(currentNumber >= 0){
    document.getElementById("currentNumber").style.color = "black";
        if(currentNumber > 10){
            document.getElementById("mais").style.display = "none";
        }
    }
    else if(currentNumber > -11){
        document.getElementById("menos").style.display = "block";
    } 
}


function decrement(){
    currentNumber = currentNumber - 1 ;
    currentNumberWrapper.innerHTML = currentNumber;
    if(currentNumber < 0){
        document.getElementById("currentNumber").style.color = "red";
    }
    else if(currentNumber <= 10){
        document.getElementById("mais").style.display = "block";
    }
    if(currentNumber < -10){
        document.getElementById("menos").style.display = "none";
    } 
}
