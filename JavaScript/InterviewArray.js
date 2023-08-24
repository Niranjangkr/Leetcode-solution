let role = [
    {
        id: 1,
        status: "Internship"
    },
    {
        id: 2,
        status: "Confirmed"
    },
    {
        id: 3,
        status: "Internship"
    }
]

let users = [
    {
        id: 1,
        Name: "Niranjan"
    },
    {
        id: 2,
        Name: "Gitanjali"
    },
    {
        id: 3,
        Name: "Ram"
    }
]

// you want to make a following third new array using the above two array
/**  
let result = {
    Internship: [
        {
            id: 1,
            status: "Internship",
            Name: "Niranjan"
        },
        {
            id: 3,
            status: "Internship",
            Name: "Ram"
        }

    ],
    Confirmed: [
        {
            id: 2,
            status: "Confirmed",
            Name: "Gitanjali"
        }
    ]
}  */ 

let result = {}

role.forEach(ele => {
    const user = users.find(user => ele.id === user.id);
    if(user) {
        let entry = {
            id: ele.id,
            Status: ele.status,
            name: user.Name
        }

        if(!result[ele.status]){
            result[ele.status] = [];
        }
        result[ele.status].push(entry)
    }
})

console.log(result)