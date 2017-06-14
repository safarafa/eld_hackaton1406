setInterval(function(){
    var http = new XMLHttpRequest();
    var url ='http://localhost:8080/temperature';
    var method = 'GET';
    http.open(method,url);

    http.onreadystatechange=function () {
    if(http.readyState == XMLHttpRequest.DONE && http.status === 200){
        var temperature=JSON.parse(http.responseText);
        
        document.getElementById('temperatura').value=temperature.tempValue+' '+temperature.tempType;
    }else if(http.readyState === XMLHttpRequest.DONE){
        console.log('error');
    }
}
http.send();    
},2000);

var inc = document.getElementById('incr');

inc.onclick = function (){
    var http = new XMLHttpRequest();
    var url ='http://localhost:8080/temperature/increment';
    var method = 'POST';
    http.open(method,url,true);
    http.onreadystatechange=function () {
    if(http.readyState == XMLHttpRequest.DONE && http.status === 200){
        window.alert('TempInceremented');
    }else if(http.readyState === XMLHttpRequest.DONE){
        console.log('error');
    } 
       
    http.send();
    }
};

var dec = document.getElementById('decr');
    
dec.onclick =function (){
    var http = new XMLHttpRequest();
    var url ='http://localhost:8080/temperature/decrement';
    var method = 'POST';
    http.open(method,url,true);
    http.onreadystatechange=function () {
    if(http.readyState == XMLHttpRequest.DONE && http.status === 200){
        alert('TempDeceremented');
    }else if(http.readyState === XMLHttpRequest.DONE){
        console.log('error');
    }      
    http.send();      
    }
};
