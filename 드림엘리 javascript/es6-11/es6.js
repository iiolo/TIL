/**
 * Shorthand property names
 * https://developer.mozilla.org/ko/docs/Web/JavaScript/Reference/Operators/Object_initializer
 *
 */
{
    const laura1 = {
        name: 'Laura',
        age: '24',
    };

    const name = 'Laura';
    const age = '24';

    //💩
    const laura2 = {
        name: name,
        age: age,
    };

    //✨
    const laura3 = {
        name,
        age,
    };

    console.log(laura1, laura2, laura3);
}

/**
 * Destructuring Assignment
 * https://developer.mozilla.org/ko/docs/Web/JavaScript/Reference/Operators/Destructuring_assignment
 */

{
    //object
    const student = {
        name: 'laura',
        level: 1,
    };

    //💩
    {
        const name = student.name;
        const level = student.level;
        console.log(name, level);
    }

    //✨
    {
        const { name, level } = student;
        console.log(name, level);
    }

    // array
    const animals = ['🐶', '🐱'];

    //💩
    {
        const first = animals[0];
        const second = animals[1];
        console.log(first, second);
    }

    // ✨
    {
        const [first, second] = animals;
        console.log(first, second);
    }
}

/**
 * Spread Syntax
 * https://developer.mozilla.org/ko/docs/Web/JavaScript/Reference/Operators/Spread_syntax
 */

{
    const obj1 = { key: 'key1' };
    const obj2 = { key: 'key2' };
    const array = [obj1, obj2];

    // array copy
    const arrayCopy = [...array];
    console.log(array, arrayCopy);

    const arrayCopy2 = [...array, { key: 'key3' }];
    obj1.key = 'newKey';
    console.log(array, arrayCopy, arrayCopy2);

    //object copy
    const obj3 = { ...obj1 };
    console.log(obj3);

    // array concatenation
    const fruits1 = ['🍑', '🍓'];
    const fruits2 = ['🍌', '🥝'];
    const fruits = [...fruits1, ...fruits2];
    console.log(fruits);

    //object merge
    const dog1 = { dog1: '🐕' };
    const dog2 = { dog2: '🐶' };
    const dog = { ...dog1, ...dog2 };
    console.log(dog);
}

/** Default parameters
 * https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Functions/Default_parameters
 */
{
    //💩
    {
        function printMessage(message) {
            if (message == null) {
                message = 'default message';
            }
            console.log(message);
        }
        printMessage('hello');
        printMessage();
    }

    // ✨
    {
        function printMessage(message = 'default message') {
            console.log(message);
        }

        printMessage('hello');
        printMessage();
    }
}

/**Ternary Operator
 * https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Operators/Conditional_Operator
 */
{
    const isCat = true;

    //💩
    {
        let component;
        if (isCat) {
            component = '🐱';
        } else {
            component = '🐶';
        }
        console.log(component);
    }

    //✨
    {
        const component = isCat ? '🐱' : '🐶';
        console.log(component);
    }
}

/** Template Literals
 * https://developer.mozilla.org/ko/docs/Web/JavaScript/Reference/Template_literals
 */
{
    const weather = '⛅';
    const temperature = '16℃';

    //💩
    console.log(
        'Today weather is ' + weather + ' and temperature is ' + temperature
    );

    // ✨
    console.log(
        `Today weather is ${weather} and temperature is ${temperature}`
    );
}
