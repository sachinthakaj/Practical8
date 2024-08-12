file:///C:/Users/Sachinthaka/OneDrive/Desktop/2Y%20SEM1/Functional%20Programming/Practical8/practical8.scala
### java.nio.file.InvalidPathException: Illegal char <:> at index 3: jar:file:///C:/Users/Sachinthaka/AppData/Local/Coursier/cache/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-library/2.13.12/scala-library-2.13.12-sources.jar!/scala/Int.scala

occurred in the presentation compiler.

presentation compiler configuration:


action parameters:
offset: 1284
uri: file:///C:/Users/Sachinthaka/OneDrive/Desktop/2Y%20SEM1/Functional%20Programming/Practical8/practical8.scala
text:
```scala
@main def p8():Unit={
    
    println(caesarCipher())

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

def checkMultipler():String={
    val num=scala.io.StdIn.readInt()
    num match@@


}



```



#### Error stacktrace:

```
java.base/sun.nio.fs.WindowsPathParser.normalize(WindowsPathParser.java:182)
	java.base/sun.nio.fs.WindowsPathParser.parse(WindowsPathParser.java:153)
	java.base/sun.nio.fs.WindowsPathParser.parse(WindowsPathParser.java:77)
	java.base/sun.nio.fs.WindowsPath.parse(WindowsPath.java:92)
	java.base/sun.nio.fs.WindowsFileSystem.getPath(WindowsFileSystem.java:232)
	java.base/java.nio.file.Path.of(Path.java:147)
	java.base/java.nio.file.Paths.get(Paths.java:69)
	scala.meta.io.AbsolutePath$.apply(AbsolutePath.scala:58)
	scala.meta.internal.metals.MetalsSymbolSearch.$anonfun$definitionSourceToplevels$2(MetalsSymbolSearch.scala:70)
	scala.Option.map(Option.scala:242)
	scala.meta.internal.metals.MetalsSymbolSearch.definitionSourceToplevels(MetalsSymbolSearch.scala:69)
	dotty.tools.pc.completions.CaseKeywordCompletion$.sortSubclasses(MatchCaseCompletions.scala:326)
	dotty.tools.pc.completions.CaseKeywordCompletion$.matchContribute(MatchCaseCompletions.scala:276)
	dotty.tools.pc.completions.Completions.advancedCompletions(Completions.scala:307)
	dotty.tools.pc.completions.Completions.completions(Completions.scala:109)
	dotty.tools.pc.completions.CompletionProvider.completions(CompletionProvider.scala:90)
	dotty.tools.pc.ScalaPresentationCompiler.complete$$anonfun$1(ScalaPresentationCompiler.scala:146)
```
#### Short summary: 

java.nio.file.InvalidPathException: Illegal char <:> at index 3: jar:file:///C:/Users/Sachinthaka/AppData/Local/Coursier/cache/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-library/2.13.12/scala-library-2.13.12-sources.jar!/scala/Int.scala