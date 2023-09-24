import re

def validateTime(time) {
    print(bool(re.search('[01]{2}:[0-60-9]{2}')))
    # return regex
}

validate_time('1:00') # True
validate_time('1:00') # True
validate_time('00:00') # True
validate_time('09:00') # True

validate_time('13:1') # False
validate_time('12:60') # False
validate_time('12: 60') # False
validate_time('24:00') # False
validate_time('24o:00') # False
validate_time('24:000') # False
validate_time('') # False
validate_time('2400') # False
validate_time('foo12:00bar') # False
validate_time('010:00') # False
validate_time('1;00') # False