import {useState} from "react";
import axios from "axios";

export default function HelloChris() {
    const [greeting, setGreeting] = useState<string>("");

    function handleGreet() {
        axios.get("/api/example")
            .then((response) => {
            console.log(response.data);
            setGreeting(response.data.greeting);})

    }


    return (
        <>
            <h1>Hello World!</h1>
            <button onClick={handleGreet}>click me</button>
            <h2>{greeting}</h2>
        </>

    )
}