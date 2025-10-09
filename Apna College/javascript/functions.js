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

  

     //  Arrows Functions


      console.log(" this is example of arrow fun");
     let power=(a,b)=>
     {
        return a**b;
     }

     let power1=(a,b)=>a**b    // when we want to return value we can do like this 
     

      let name1=str=>     // when only 1 argument not need to give ()
     {
        console.log(str);
     }

      let name2= () =>     // when No argument pass , need to give ()
     {
        console.log("jare");
     }

     console.log(power(2,3));
       console.log(power1(2,4));
     name1("Tushar");
     name2();



// //   SetTimeout Function

// console.log(" hii ");

// setTimeout( ()=> 
// {
//     console.log(" Tushar ");
// },4000)

// console.log(" Welcome");



// console.log(" hello ");

// setTimeout( function greed9 ()
//  {
//     console.log(" Dipak ");
// },4000)

// console.log(" Welcome");




// // Set interval 
// // excute fun againg & agin after time 


// console.log(" Example of set interval ");


// console.log(" Welcome ");

// setInterval( ()=> 
// {
//     console.log(" Developer  ");
// },100000)
   



//  Use of this in normal and arrow function 


console.log(" Use of this in normal and arrow function ");

const infobean =
{
    name :"Sarthak",
    marks :90,
    prop :this, // global scope 
                // this keyword refers window object(default) 
    getName : 
              function (){
                console.log(this);
                // object is printed because this refers 
                return this.name;
                //   this return the name 
              },
     getMarks : ()=>{
            console.log(this);
                return this.marks;
                // not give marks because in Arrow this refers  who call parent 
     },
     
     getInfo1 : function()
     {
        setTimeout(()=>{
            console.log(this); // student
        },10 )
     },

     getInfo2 : function()
     {
        setTimeout(function (){
            console.log(this); // Window
        },10 )
     },

}

console.log(infobean.getName());
console.log(infobean.getMarks());
console.log(infobean.getInfo1());
console.log(infobean.getInfo2());



// Arrow function for return square of number 

console.log(" square of numbers  ");

 square= (n)=>
{
     return n*n;
}

console.log(square(4));




// qustion 2 use setInterval function and strop exucation of that function 


console.log("Ahmednager collage after 2 sec   ");

let id1=setInterval( ()=>
{
    console.log(" Ahmednager College ");
},2000);

setTimeout(()=>{
    clearInterval(id1);  // we stored id of Setinterval in id1 and
                         // stop setinteral using clearInterval
},10000);







