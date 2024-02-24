import { writable } from "svelte/store";
import { UserCookies } from "../lib/Cookies/User";


export const user = writable(UserCookies.getUser());