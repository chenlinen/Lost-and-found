import Mock from 'mockjs';
Mock.mock('/api/register', 'post', () => {
    return {
        "code": 0,
        "message": "注册成功！",
        "data": {
            "userid": 1,
            "username": "owner",
            "password": "123456"
        }
    }
})