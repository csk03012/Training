#! /bin/sh
FIRST="Hello, I am Chandra Shekhar Kasaudhan"
SECOND="From IIT Hyderabad" 
# creating the file and inserting the line at the same time.
# echo "First line: $FIRST" > Assignment
# Only appending the line in the file created already
# echo "Second line: $SECOND" >> Assignment

# 1a). creating empty file, if already existed than it will update timestamp (Assignment)
touch Assignment

# 1b). appending lines to created file (content)
echo "$FIRST" >> Assignment
echo "$SECOND" >> Assignment

# 2) moving file to tmp directory
mv Assignment /tmp
cd /tmp||return

# 3) variable to store absolute path of above created file after moving it to tmp.
FILE_PATH=$(realpath Assignment)

# 4) printing the variable
# echo "$FILE_PATH"
printf "%s\n" "$FILE_PATH"
