filename="WordSearchTest.txt"
file = open(filename,"r")
board=[]
row=[]

words=["Spaghetti","Cheese","Noodle","Baguettes","Rome","Pie","Italian","Lasagna","Geese"]
reversedWords=[]
neWords=[]
for i in range(len(words)):
    wordToReverse=words[i].upper()
    wordReverse=wordToReverse[::-1]
    reversedWords.append(wordReverse)
    wordReverse=''

for i in range(len(words)):
    newWords=words[i].upper()
    neWords.append(newWords)
    newWords=''
#print(reversedWords)

for line in file:
     #rstrip to remove the \n  and split the line on the \t
     row=line.rstrip().replace("\t","")
     board.append(row)
     
file.close()  

#look through each columns to see if the word you
# are looking for is in there

def horizontal():
    for r in range(len(board)):
        for c in range(len(board[0])):
            print(board[r][c],end="")
        print()
    print("\n")
    for wordsIterater in range(9):
        for rowInBoard in range(10):
            if neWords[wordsIterater] in board[rowInBoard]:
                print("Words Found")
                print(neWords[wordsIterater])
            elif reversedWords[wordsIterater] in board[rowInBoard]:
                print("reversedWords Found")
                print(reversedWords[wordsIterater])
                
                
print("\n"*3)

#look through each row to see if the word you
# are looking for is in there
#rotate the board 90 degrees

for c in range(len(board[0])):
    for r in range(len(board)):
        print(board[r][c],end="")
    print()



#look through each row and columns to see if the word you
# the word you are looking for is in there

for r in range(len(board)):
    for c in range(len(board[0])):
        # print(str(r)+str(c),end=" ")
        print(board[r][c],end=" ")
        r+=1
        c+=1
        if r>=(len(board)) or (c>=len(board[0])):
            break
    print()
    # break
print("\n"*3)
out=""
diagonalboard=[]
for c in range(len(board[0])):
    for r in range(len(board)):
        # print(str(r)+str(c),end=" ")
        print(board[r][c],end=" ")
        out+=board[r][c]
        r+=1
        c+=1
        if r>=(len(board)) or (c>=len(board[0])):
            diagonalboard.append(out)
            out=""
            break
    print()
    # break
print(diagonalboard)



























"""
    Spaghetti
    Cheese
    Noodle
    Baguettes
    Rome
    Pie
    Italian
    Lasagna
    Geese
"""