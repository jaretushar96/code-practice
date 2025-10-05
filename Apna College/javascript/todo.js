let todo=[];

let choice =prompt("Its To do list enter your choice  ");

while(true){

     if(choice=="exit")
    {
        console.log(" exited ");
        break;
    }
     
    if(choice=="add")
    {
       
      
          let task= prompt(" Enter work to add");

          todo.push(task);
          console.log(" Task added");
        
    }

    else if(choice =="print")
    {
            console.log("---------");
     for(let i=0;i<todo.length;i++)
        {
        

           console.log(i,todo[i]);

           
        }
         console.log("---------");
    }


    else if(choice=="delate")
    {
        let ind=prompt(" please enter the index for delet ");

        todo.splice(ind,1);
         console.log(" deleated....");
    }

   
    else{
        console.log("Wrong choice ");
    }


    choice =prompt(" enter your choice form list   ");


}
