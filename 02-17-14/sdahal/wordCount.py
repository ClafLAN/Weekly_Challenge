# Sakshyam Dahal

# Write a program that processes a text file and calculates the number of words it contains.
# A word is simply a sequence of
# non-blank characters and punctuation.

def word_counter(file_name):
    # opens a file and save contents as a string
    f_ptr = open(file_name, "r")
    all_lines = f_ptr.read()

    # doesnot count these characters as words
    whitespace = [" ", "\n", '!', ',', '?','.' ]
    
    # variable declarations
    words = 0
    start_index = 0
    end_index = len(all_lines) - 1
    start_was_alpha_num = False
    end_was_alpha_num = False
    count = 0
   
    
    # begin fromt the start and end unless they cross eachother
    while start_index < end_index:
        count += 1
        # add words only if character is and was not a whitespace
        if (all_lines[start_index]).isalnum() or (all_lines[end_index]).isalnum():
            if (all_lines[start_index]).isalnum() and not start_was_alpha_num:
                words += 1
                start_was_alpha_num = True

            if (all_lines[end_index]).isalnum() and not end_was_alpha_num:
                words += 1
                end_was_alpha_num = True

        if all_lines[start_index] in whitespace:
            start_was_alpha_num = False
        if all_lines[end_index] in whitespace:
            end_was_alpha_num = False
        
        # update the indices
        start_index += 1
        end_index -= 1
    
    # if the start and end counter is processing same word at the end
    if (all_lines[start_index]).isalnum() and  (all_lines[end_index]).isalnum():
        words -= 1

    # found a word or words
    if words <= 1:
        grammar = ""
    else:
        grammar = "s"

    # print the result    
    print "Found " + str(words) + " word" + grammar +" in the file."    
   

# get things rolling
file_to_read = "../Documents/test.dat"
word_counter(file_to_read)
