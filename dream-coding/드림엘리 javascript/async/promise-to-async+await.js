// callback hell example to promise
class UserStorage {
    loginUser(id, password) {
        return new Promise((resolve, reject) => {
            setTimeout(() => {
                if (
                    (id === 'laura' && password === 'dream') ||
                    (id === 'color' && password === 'academy')
                ) {
                    resolve(id);
                } else {
                    reject(new Error('not found'));
                }
            }, 2000);
        });
    }

    getRoles(user) {
        return new Promise((resolve, reject) => {
            setTimeout(() => {
                if (user == 'laura') {
                    resolve({ name: 'laura', role: 'admin' });
                } else {
                    reject(new Error('no access'));
                }
            }, 1000);
        });
    }
}

// id, password 받아오기 > login 함수 호출 > login 함수에서 받아온 user 데이터 토대로 roles 함수 호출
const userStorage = new UserStorage();
const id = prompt('enter your id');
const password = prompt('enter your password');

async function find() {
    try {
        const userInfo = await userStorage.loginUser(id, password);
        const user = await userStorage.getRoles(userInfo);
        alert(`Hello ${user.name}, you have a ${user.role} role`);
    } catch (error) {
        console.log(error);
    }
}

find();
