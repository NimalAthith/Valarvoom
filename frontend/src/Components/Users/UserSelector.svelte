<script>
  import { UserSerives } from "../../lib/Services/Users";
  import tickSVG from "../../assets/SVG/tick.svg";
  import { fade } from "svelte/transition";
  import { UserCookies } from "../../lib/Cookies/User";
  import { user } from "../../store/user";
  import Model from "../Templates/Model.svelte";
  let select = -1;
  // your script goes here
  export let isInCreate;
  let users = UserSerives.getUsers();
</script>

<Model name="Select a User">
  <div
    class="flex gap-1 rounded-lg mt-3 max-sm:h-52 h-32 flex-col overflow-y-scroll overflow-x-hidden w-96 max-sm:w-full px-3"
  >
    {#each users as user (user.id)}
      <button
        class="flex select-none items-center gap-3 py-1 px-2 transition-all hover:scale-110 z-10 bg-gray-50 rounded-md hover:shadow-sm active:scale-95"
        on:click={() => {
          select = user.id;
        }}
      >
        <div class=" relative size-fit">
          <img
            class="size-8 absolute top-0 rounded-full left-0 z-[2]"
            src={user.img}
            alt="profile"
          />
          <img
            class="size-8 rounded-full blur-sm z-[3]"
            src={user.img}
            alt="profile"
          />
        </div>
        <span class=" font-semibold">{user.name}</span>
        {#if user.id === select}
          <img
            transition:fade={{ delay: 50, duration: 300 }}
            class="size-4 ml-auto mr-4"
            alt="selected"
            src={tickSVG}
          />
        {/if}
      </button>
    {/each}
  </div>
  <div class="flex items-baseline justify-between pl-3">
    <button
      class="text-blue-700 font-semibold text-md"
      on:click={() => {
        isInCreate = true;
      }}>Create User</button
    >
    <button
      class={`px-2 py-1 mt-2 text-white font-semibold rounded-lg transition-all text-lg ${
        select === -1
          ? "bg-gray-400"
          : "bg-blue-700 hover:brightness-110 active:scale-95"
      }`}
      disabled={select === -1}
      on:click={() => {
        UserCookies.setUser("" + select);
        $user = "" + select;
      }}>Select</button
    >
  </div>
</Model>

<style>
  ::-webkit-scrollbar {
    width: 5px;
    border-radius: 6px;
    padding-top: 20px;
  }

  ::-webkit-scrollbar-track {
    box-shadow: inset 0 0 3px rgba(0, 0, 0, 0.3);
    border-radius: 6px;
  }

  ::-webkit-scrollbar-thumb {
    background-color: black;
    outline: transparent;
    border-radius: 6px;
  }
</style>
