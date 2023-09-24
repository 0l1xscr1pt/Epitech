import re

re.search("[a-z]")

Your regex should match:

""
"abc"
"aaabc "
"a bc"
"  abcdefghijk"
"abdfkmnpstvxz"
"cxy"
"cdklstxy"
"bfrtw"
"a b c  "
" acg jko pr"
"a z "
"v  z"
"a  b cdefg kl"
"uv xyz"
" ab de gh"
"x yz"
"abcdefghijklmnopqrstuvwxyz"
"a bcdefghijklmnopqrstuvwxyz"



It should NOT match:

"abcb"
"a bcdjkrza"
"qwerty"
"zyxcba"
"abcdfe"
"ab c dfe"
"a  z  a"
"asdfg"
"asd  f g"
"poqwoieruytjhfg"
"\tab"
"abc\n"
