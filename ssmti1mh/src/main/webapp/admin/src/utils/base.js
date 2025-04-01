const base = {
    get() {
        return {
            url : "http://localhost:8080/ssmti1mh/",
            name: "ssmti1mh",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmti1mh/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "课程可视化教学系统"
        } 
    }
}
export default base
