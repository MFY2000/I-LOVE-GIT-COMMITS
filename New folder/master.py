## File Reader
import subprocess as cmd
import os
import time
import random
import string
import time; 

def todo():
    cmd.run("git add .", check=True, shell=True)
    cmd.run("git commit -m MFY",check=True, shell=True)

letters = string.ascii_lowercase

# if input("Enter the password: ") == "00414":

# noOFcomment = int(input("Enter the Number of Comment you Wants: "))

noOFcomment = 1000

for a in range(5):
    for i in range(noOFcomment):
        with open("1", "a+") as f:
                f.write(''.join(random.choice(letters) for i in range(7)))
                time.sleep(1)
                todo()
                print(chr(27)+'[2j')
                print('\033c')
                print('\x1bc')
                print ("Git Comment number: ",(i+1), end="\r")
    cmd.run("git push origin master",check=True, shell=True)
int(input("Enter to Close......"))