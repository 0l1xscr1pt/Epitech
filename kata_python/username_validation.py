import re

def validate_usr(username):
    return bool(re.match("^[a-z0-9_]{4,16}$", username))