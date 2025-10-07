function multiple(func, count)
{
    for(let i=1;i<=count;i++)
    {
        func();
    }
}
    let greet= function()
    {
        console.log("hello");
    }


multiple(greet,100);




function oddEvenFactory(req)
{


if( req=="odd")
{
let odd= function(n)
{
    console.log(!(n%2==0));
}
return odd;
}

else if(req=="even")
{
    let even= function(n)
{
    console.log((n%2==0));
}
return even;
}


}

let fu=oddEvenFactory("odd");
fu(10);






// methods ( function in object )


      console.log(" this is example of Methods in object ");
const calculator ={
     add: function(a,b)
     {
        return a+b;
     },
     sub: function(a,b)
     {
        return a-b;
     },
     mult: function(a,b)
     {
        return a*b;
     },
    }

    console.log(calculator.add(4,5));
     console.log(calculator.sub(14,9));



//  same but in different way 
const calculator1 ={
     add(a,b)
     {
        return a+b;
     },
     sub(a,b)
     {
        return a-b;
     },
     mult (a,b)
     {
        return a*b;
     },
    }

    console.log(calculator.add(9,5));
    console.log(calculator.sub(14,3));

     