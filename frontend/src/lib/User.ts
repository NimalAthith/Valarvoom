import Cookies from "./Cookies";

export class UserCookies {
  public static getUser() {
    return Cookies.getCookie("user");
  }

  public static setUser(name: string) {
    Cookies.setCookie("user", name, 10000);
  }
}
