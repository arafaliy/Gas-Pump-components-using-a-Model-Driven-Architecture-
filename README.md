Gas-Pump components using a Model-Driven Architecture
==========
Goal
-
       The goal of this project is to design three different GasPump components using a Model-Driven Architecture (MDA) and then 
       implementation of these GasPump components based on this design.

There are three GasPump components: GasPump-1, GasPump-2 and GasPump-3.

The GasPump-1 component supports the following operations:
-
- Activate (int a)    // the gas pump is activated where a is the price of the gas per gallon
- Start() //start the transaction
- PayCredit() // pay for gas by a credit card
- Reject() // credit card is rejected
- Cancel() // cancel the transaction
- Approved() // credit card is approved
- PayCash(int c) // pay for gas by cash, where c represents prepaid cash
- StartPump() // start pumping gas
- PumpGallon() // one gallon of gas is disposed
- StopPump() // stop pumping gas

The GasPump-2 component supports the following operations:
-
- Activate (float a, float b) // the gas pump is activated where a is the price of the regular gas
 // and b is the price of super gas per gallon
- Start() //start the transaction
- PayCredit() // pay for gas by a credit card
- Reject() // credit card is rejected
- Cancel() // cancel the transaction
- Approved() // credit card is approved
- Super() // Super gas is selected
- Regular() // Regular gas is selected
- StartPump() // start pumping gas
- PumpGallon() // one gallon of gas is disposed
- StopPump() // stop pumping gas 

The GasPump-3 component supports the following operations:
-
- Activate (float a, float b) // the gas pump is activated where a is the price of regular gas
 // and b is the price of premium gas per liter
- Start() //start the transaction
- PayCash(float c) // pay for gas by cash, where c represents prepaid cash
- Cancel() // cancel the transaction
- Premium() // Premium gas is selected
- Regular() // Regular gas is selected
- StartPump() // start pumping gas
- PumpLiter() // one liter of gas is disposed
- StopPump() // stop pumping gas
- Receipt() // Receipt is requested
- NoReceipt() // No receipt

------

For Demo : Run GasPumpDemo.jar
In terminal/console  type :  java -jar GasPumpDemo.jar
