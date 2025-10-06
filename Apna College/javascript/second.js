
// literals
let student={
    name : "Tushar",
    age : 22,
    marks:94

}

// Object
let stu2=["tushar",22,94];

// creating post

const post={
    username :"@tusharjare",
    content :"this is my 1 st post ",
    likes : 150,
    repost : 3,
    tagged :["@coding","java Developer"]
}

console.log(post);
console.log(post.content);     
console.log(post["content"]); 

// how to update value of key in object
post.likes=200;
post.repost="five";
post.tagged.push("@xyz","@Google");
post.gender="Male";   // Add new value in object
post.city="Pune"; 
console.log(post);

delete post.tagged[2];
delete post.gender;

console.log(post);
console.log(post.tagged);
console.log(post.tagged[2]);


//  nested object

const stud =
{

    tushar :
    {
        surname :"Jare",
        city : "pune",
        rollNo :51,
        marks :[99,98,88,96]

    },
    dipak :
    {
        surname :"Chande",
        city : "Shevgaon",
        rollNo :55,

    },
    visvas :
    {

        surname :"Alhat",
        city : "Nager",
        rollNo :22,
    }

}

console.log(stud);
console.log(stud.tushar);
console.log(stud.tushar.surname);

stud.tushar.marks.push(97,95,94);
stud.tushar.rollNo=10;
delete stud.tushar.marks[2];
delete stud.tushar.city;


console.log(stud.tushar.marks);
console.log(stud.tushar);


