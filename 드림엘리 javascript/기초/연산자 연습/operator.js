// false : 0, -0, '', null, undefined
// true : -1, 'hello', 'false'
let obj = {
    name: 'laura',
};
if (obj) {
    console.log(obj.name);
}

obj && console.log(obj.name);
