<script context="module">
  import { UserCookies } from "../lib/Cookies/User";
  import { user } from "../store/user";

  // your script goes here
</script>

<button on:click={()=>{
  UserCookies.deleteUser();
  $user = null;}}>Remove User</button>
