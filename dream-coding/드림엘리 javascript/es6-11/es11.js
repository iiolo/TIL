/**
 * Optional chaining
 * https://developer.mozilla.org/ko/docs/Web/JavaScript/Reference/Operators/Optional_chaining
 */
{
    const person1 = {
        name: 'Laura',
        job: {
            title: 'S/W Engineer',
            manager: {
                name: 'Bob',
            },
        },
    };

    const person2 = {
        name: 'Bob',
    };

    //💩💩💩💩💩
    {
        function printManager(person) {
            console.log(person.job.manager.name);
        }

        printManager(person1);
        //printManager(person2);//manager가 존재하지 않기 때문에 에러 메세지 발생
    }

    // 💩💩💩
    {
        function printManager(person) {
            console.log(
                person.job
                    ? person.job.manager
                        ? person.job.manager.name
                        : undefined
                    : undefined
            );
        }

        console.log(person1);
        console.log(person2);
    }

    //💩
    {
        function printManager(person) {
            console.log(
                person.job && person.job.manager && person.job.manager.name
            );
        }

        printManager(person1);
        printManager(person2);
    }

    console.clear();
    //✨
    function printManager(person) {
        console.log(person.job?.manager?.name);
    }

    printManager(person1);
    printManager(person2);
}

/**
 * Nullish Coalescing Operator
 * https://developer.mozilla.org/ko/docs/Web/JavaScript/Reference/Operators/Nullish_coalescing_operator
 */
{
    //Logical OR operator
    // false : false, '', 0, -0, undefined, null
    //💩
    {
        const name = 'Laura';
        const userName = name || 'Guest';
        console.log(userName);
    }
    {
        const name = '';
        const userName = name || 'Guest';
        console.log(userName);

        const num = 0;
        const message = num || 'undefined';
        console.log(message);
    }

    //✨
    {
        const name = '';
        const userName = name ?? 'Guest';
        console.log(userName);

        const num = 0;
        const message = num ?? 'undefined';
        console.log(message);
    }
}
