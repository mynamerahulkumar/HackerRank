def count_substring(string, sub_string):
    string_size=len(string)
    sub_string_size=len(sub_string)
    count=0
    for i in range(0,string_size-sub_string_size+1):
            if string[i:i+sub_string_size]==sub_string:
                count+=1
    #print(count)
    return count
