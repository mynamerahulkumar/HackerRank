/*
 * Complete the vowelsAndConsonants function.
 * Print your output using 'console.log()'.
 */
function vowelsAndConsonants(s) {
    //first print constant and then vowel
    for(let c of s){
        switch(true){
            case 'aeiou'.includes(c):
                      console.log(c);
                      break;                    
        }
    }
    for(let c of s){
        switch(true){
            case 'aeiou'.includes(c) :                   
                     break;    
            default:
                console.log(c);
                break;
        }
    }
 
}
