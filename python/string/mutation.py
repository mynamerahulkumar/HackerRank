def mutate_string(string, position, character):
    string=string[:position]+character+string[position+1:]
   # print (string)
    return string
