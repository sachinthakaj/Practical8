@main def p8():Unit={
    
    //println(caesarCipher())
    checkMultipler()

}

def shiftCharEncryption(c:Char,key:Int):Char={
    if(c.isLetter){
        
             val baseLetter =if (c.isUpper) 'A' else 'a'

             ((c - baseLetter + key) % 26 + baseLetter).toChar
       
    }    
    else{
        c
    }
}

def shiftCharDecryption(c:Char,key:Int):Char={
    if(c.isLetter){
        
             val baseLetter =if (c.isUpper) 'A' else 'a'

             ((c - baseLetter - key + 26) % 26 + baseLetter).toChar
       
    }    
    else{
        c
    }
}


def encryption(key:Int,text:String):String={
    text.map(c => shiftCharEncryption(c,key))

}

def decryption(key:Int,text:String):String={
    text.map(c => shiftCharDecryption(c,key))

}

def caesarCipher():String={
    println("Enter the text:")
    val text=scala.io.StdIn.readLine()

    println("Encrypt or Decrypt:")
    val input=scala.io.StdIn.readLine()

    println("Shift value:")
    val shift=scala.io.StdIn.readInt()
    println("Encrypted/Decrypted text:")
    if(input == "Encrypt"){
        encryption(shift,text)
    }
    else{
        decryption(shift,text)
    }
}

def checkMultipler():Unit={
    println("Enter Number:")
    val num=scala.io.StdIn.readInt()
    num match{
        case num if (num % 3 == 0 && num % 5 == 0) =>println("Multiple of three and five")
        case num if num % 3 == 0 =>println("Multiple of three")
        case num if num % 5 == 0 =>println("Multiple of five")
        case _ =>println("Not a multiple of three or five")
    }


}


