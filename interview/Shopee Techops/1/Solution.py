def thousand_number_separator(number) :
  string = ""
  counter = 0
  for i in range(len(str(number))-1,-1,-1):
    if counter % 3 == 0 and i != len(str(number))-1 :
      string = "," + string
    string = str(number)[i] + string
    counter += 1
  return string

print(thousand_number_separator(131312))