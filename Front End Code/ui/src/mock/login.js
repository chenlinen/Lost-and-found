import Mock from 'mockjs';
Mock.mock('/api/login', 'post', () => {
    return {
        "code": 0,
        "message": "登录成功！",
        "data": {
            "userid": 1,
            "username": "owner",
            "password": "123456"
        }
    }
})