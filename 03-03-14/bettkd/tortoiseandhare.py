class TortoiseAndHare:
    global FASTPLOD, SLIP, SLOWPOD,\
           SLEEP, BIGHOP, BIGSLIP, SMALLHOP, SMALLSLIP,\
           randomPosition, tortMove, hareMove
    
    FASTPLOD = 3
    SLIP = -6
    SLOWPOD = 1
    SLEEP = 0
    BIGHOP = 9
    BIGSLIP = -12
    SMALLHOP = 1
    SMALLSLIP = -2
        
    def randomPosition():
        import random
        return random.randrange(0, 10, 1)

    def tortMove():
        temp = randomPosition()
        if temp < 5:
            return FASTPLOD
        elif temp < 7:
            return SLIP
        else:
            return SLOWPOD
        
    def hareMove():
        temp = randomPosition()
        if temp < 2:
            return SLEEP
        elif temp < 4:
            return BIGHOP
        elif temp < 5:
            return BIGSLIP
        elif temp < 8:
            return SMALLHOP
        else:
            return SMALLSLIP

    def compete():
        import time
        t = 1
        tortPosition = 1
        harePosition = 1
            
        while True:
            print ("Time: ", t)
            print ("Position of tortoise: ", tortPosition)
            print ("Position of hare: ", harePosition, "\n=======================")
            if tortPosition > 69 and harePosition < 69:
                print ("Tortoise wins the race!")
                break
            elif harePosition > 69 and tortPosition < 69:
                print ("Hare wins the race!")
                break
            elif harePosition > 69 and tortPosition > 69:
                print ("Its a tie!")
                break
            
            time.sleep(1)
            tortPosition += tortMove()
            harePosition += hareMove()
            t += 1

            if tortPosition < 1:
                tortPosition = 1
            if tortPosition > 70:
                tortPosition = 70
            if harePosition < 1:
                harePosition = 1
            if harePosition > 70:
                harePosition = 70

    compete()
