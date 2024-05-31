# reverseString

## This program take a string from user and reverse it then print it in the console.
## Contains two methods:
- getString :which getting a string from user .
- reversedString : reverse the string that have been typed from user.
## Can we make reversedString in other way ?
- The answer is yes if we make a new string and take each char from the string from (lentgh - 1 to 0 ) using charAt method and concat this char to the new string.
### This is the other code:
```
private static String reversedString(String originalString) {
		String reversedString = "";
		for (int i = originalString.lentgh - 1; i >= 0; i--)
   {
        reversedString += originalString.charAt(i);
   }
    return reversedString;
	}

```
 ### Why I choosed this way ?
 - because StringBuilder mutable and string is immutable.
 - more consistent and readable.
