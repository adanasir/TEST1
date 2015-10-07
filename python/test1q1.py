#
#SITI AMINAH SHUHADA MAT NASIR
#2014433638
#adanasir@gmail.com
#github.com/adanasir

def main():

    buffersize = 50000

    infile=open("adanasirpy.txt", "rb")
    outfile=open("adanasirpy.bin", "wb")

    buffer = infile.read(buffersize)

    while len(buffer):
        outfile.write(buffer)
        print(".", end = " ")
        buffer = infile.read(buffersize)
    print()
    print("Done")
    
infile.close()

#file = open("", "w")
#file.write("Name: Siti Aminah Shuhada Mat Nasir\n")
#file.write("Matrix No.: 2014433638\n")
#file.write("Gender: Female\n")
#file.write("Age: 32 years old\n")
#file.write("E-mails: adanasir@gmail.com\n")
#file.write("Mobile Phone: 0199171336\n")
#file.close()