function reverseWordsInSentence(sentence) 
{
    let words = sentence.split(" ");
    let reversedWords = words.map(word => reverseWord(word));
    let reversedSentence = reversedWords.join(" ");
    return reversedSentence;
}

function reverseWord(word) 
{
    return word.split("").reverse().join("");
}

let inputSentence = "This is a sunny day";
let reversed = reverseWordsInSentence(inputSentence);
console.log(reversed);
