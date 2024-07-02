<?php
    class Person {
        public $firstName;
        public $lastName;

        function __construct($firstName, $lastName){
            $this->firstName = $firstName;
            $this->lastName = $lastName;
        }

        public function printName($num) {
            for($i=0; $i < $num; $i++){
                printf("%s %s<br>", $this->firstName, $this->lastName);
            }
        }
    }

    $person = new Person("John", "Smith");
    $person->printName(10);
?>